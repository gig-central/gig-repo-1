<?php $this->load->view($this->config->item('theme').'header'); ?>

<div class="container">
    <div class="row col-xs-12 col-md-8 lg-6 offset-lg-3">
        
        <form class="form-horizontal" role="form" method="post">
            <div class="form-group">
                <label for="Email">Email address:</label>
                <input type="email" class="form-control" value="<?php echo set_value('email'); ?>" id="Email" name="email">
            </div>
            
            
            
            <?php echo form_error('email'); ?>
            
            
            <input type="submit" class="btn btn-default" name="Submit" value="Reset My Password" />
        </form>
        
        <?php
            echo validation_errors('<p class="error">');
            if(isset($error)){
                echo '<p class="error">' . $error . '</p>';
            }
        ?>
    </div><!-- end row form -->
</div><!-- end .container -->
<?php $this->load->view($this->config->item('theme').'footer'); ?>


