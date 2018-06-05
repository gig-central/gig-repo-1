<?php

/**
 * models/Admin_model.php
 *
 * Admin model for Gig Central
 * 
 * @package ITC260
 * @subpackage Pages
 * @author Rattana Neak
 * @version 2.0 2016/06/14
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see controllers/Admin.php
 * @see view/admins/add.php
 * @see view/admins/admin.php
 * @see view/admins/index.php
 * @see view/admins/login.php
 * @see view/admins/reset.php
 * @see view/admins/success.php
 * @see view/admins/view.php
 * @todo
 */
 
class Admin_model extends CI_Model {
       public function __construct()
        {
                $this->load->database();
                $this->load->library('email');
                $this->load->library('encryption');
        }
        
        public function getInfor($data)
        {
           
           if ($data == ""){
            return FALSE;
            }else{
            $query = $this->db->get_where('Profile', array('email' => $data['email']));
            $row = $query->row();    
                if (isset($row))
                {
                    //if(pass_decrypt($row->password,KEY_ENCRYPT) == $data['pass'])
                        if(password_verify($data['pass'], $row->password))
                    {
                    
                    $newdata = array(
                        'email' => $row->email,
                        'id' => $row->id,
                        'status'=> $row->i_am_a,
                        'first_name'=> $row->first_name,
                        'last_name'=> $row->last_name,
                        'picture'=> $row->picture, 
                        'logged_in' => TRUE,
                        'bio'     => $row->bio,
                        'pass' => $row->password
                    );
                        $this->load->library('session');
                        $this->session->set_userdata($newdata); 
                        redirect('admin/');
                    }else{
                        $error = 'The password and email is not match';
                        return $error;
                    
                    }
                }
            }
        }

        public function verifyUserExists($search_term, $search_column) 
        {
            //check to see if passed email exists in the database
            $query = $this->db->get_where('Profile', array($search_column => $search_term));
            if($query->row()){
                return true;
            } else {
                return false;
            }
            
        }

        //should return an array with two pieces of hashed information. This is simply for a unique query string
        // use at least sha512 for hashing
        public function getUniqueData($email)
        {
            //get the row by email
            $query = $this->db->get_where('Profile', array('email' => $email));
            $row = $query->row();
            //Hash information to pass unique data associated with user
            $unique_data = array(
                'key' => hash('sha512', $row->email),
                'reset' => hash('sha512', $row->password)
            );
            return $unique_data;
        }

        public function resetPassword($key, $reset, $new_password)
        {
            // build array for new password insertion
            $new_pass = array(
                'password' => $new_password
            );
            // converts given values to SHA512 checksums and verifies the correct user's password is updated
            $this->db->where("SHA2(email, 512)='" . $key . "' and SHA2(password, 512) = '" . $reset . "'");
            // update user password
            $this->db->update('Profile', $new_pass);
            // if update successful return true, else return false
            if($this->db->affected_rows() != '0') {
                return true;
            } else {
                return false;
            }
        }
        
}