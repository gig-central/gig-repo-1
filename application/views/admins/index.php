<?php $this->load->view($this->config->item('theme') . 'header'); ?>
<h1>
    <?="Hi " . $first_name . ", "?><?=$logged?>
</h1>

<?php $this->load->view($this->config->item('theme') . 'footer'); ?>