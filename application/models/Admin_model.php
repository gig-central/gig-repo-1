<?php

/**
 * models/Admin_model.php
 *
 * Admin model for Gig Central
 * 
 * @package ITC260
 * @subpackage Pages
 * @author Rattana Neak, Sean Gilliland
 * @version 3.0 2018/06/05
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
            } else {
            $query = $this->db->get_where('Profile', array('email' => $data['email']));
            $row = $query->row();    
                if (isset($row))
                {
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

        /**
         * verifyUserExists method for Admin_model class. 
         *
         * @param string $search_term is being searched for in the profile table
         * @param $search_column is the column in the database to match with search term 
         * @return boolean 
         * @todo none
         */ 
        public function verifyUserExists($search_term, $search_column) 
        {
            //check to see if passed term exists in the passed column of the profile table
            $query = $this->db->get_where('Profile', array($search_column => $search_term));
            if($query->row()){
                return true;
            } else {
                return false;
            }
            
        }

        /**
         * getUniqueData method for Admin_model class. 
         *
         * @param string $email the email of the user to retrieve unique data from 
         * @return array(key => users hashed email, reset => hash of users salted/hashed password) 
         * @todo none
         */ 
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

        /**
         * resetPassword method for Admin_model class. 
         *
         * @param string $key the hashed email returned by getUniqueData method
         * @param string $reset the hash of salted/hashed password returned by getUniqueData method
         * @param string $new_password the salted/hashed new password to insert in database 
         * @return boolean
         * @todo none
         */ 
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