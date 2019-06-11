    <footer>
        <div class="row">
          <div class="col-xs-12">
		      <hr /><!-- this is the little white line that you see on the page -->
                <ul class="list-unstyled">
                <?= $this->navigation->loadFooter(); ?><!-- the actual nav items -->
                <li class="pull-right"><a href="#top">Back to top</a></li>
                </ul>
			 <p><?=$this->config->item('copyright')?>. Theme by <a href="http://bootswatch.com/">Bootswatch</a>, based on <a href="http://getbootstrap.com/css/">Bootstrap</a>.</p>

          </div>
        </div>
    </footer>
</div>

    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<?=base_url();?>public/themes/bootswatch/js/bootstrap.min.js"></script>
    <script src="<?=base_url();?>public/themes/bootswatch/js/bootswatch.js"></script>
    <script src="<?=base_url();?>public/js/jQueryRotateCompressed.js"></script>

<!--from jquery footer-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<!--load jquery ui js file-->
    <script src="<?=base_url();?>public/js/jquery-ui-1.12.1/jquery-ui.js"></script>

<!--jquery ui datepicker-->
<script type="text/javascript">
$(function() {
    $("#GigCloseDate").datepicker(
        //{
           // dateFormat: 'yy-mm-dd'
        //}
    );
});

$(function() {
    $("#VenueExpirationDate").datepicker(
        {
            dateFormat: 'yy-mm-dd'
        }
    );
});

$( function() {
    $( "#dialog" ).dialog({
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 1000
      },
      hide: {
        effect: "explode",
        duration: 1000
      }
    });

    $( "#opener" ).on( "click", function() {
      $( "#dialog" ).dialog( "open" );
    });
});

</script>

  </body>
</html>
