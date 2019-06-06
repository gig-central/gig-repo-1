<?php
$this->load->view($this->config->item('theme').'header');
?>

<div class="FAQ-wrapper">
	<h1>Gig FAQs</h1>
  	<div class="half">
	    <div class="tab blue">
			<input id="tab-one" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-one">What web browser should I use?</label>
			<div class="tab-content">
				<p>To make sure you have the best experience possible, we recommend using the most up-to-date version of one of the following browsers:<br/>
				<ul>
					<li>Internet Explorer</li>
					<li>Firefox</li>
					<li>Chrome</li>
				</ul>
			</div>
	    </div>
		<div class="tab blue">
			<input id="tab-two" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-two">How will my personal information be used?</label>
			<div class="tab-content">
				<p>With your authorization we share some personal information with employers.  Otherwise all personal information will be kept private.  We do not sell personal information to other organizations.</p>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-three" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-three">I signed up to receive Job notifications, but I am unable to apply/login to submit my application.</label>
			<div class="tab-content">
				<p>Job Interest Card requests are independent of GigCentral.com applicant accounts. To create an applicant account, go to www.GigCentral.com and click on Sign In. Under the Sign In button, click Don't have an account? Create one. Complete the required new job seeker account information, enter a new password, and click Save.</p>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-four" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-four">How do I apply for a job?</label>
			<div class="tab-content">
				<p>To apply for a job, go to GigCentral.com website. If you are on GigCentral.com, go to the Find a gig page and enter search criteria in the boxes for Job Title, Keyword, and/or City or State. You can also search by clicking a Category or Location.</p>
				<ul>
					<li>If you are on an organization's website, locate where open positions are posted.</li>
					<li>Perform a job search to find jobs that match your interests. Then click on the job title to view the job posting.</li>
					<li>To initiate the application process click the Apply tab. The Apply tab is located toward the top of the posting next to Job Details.</li>
					<li>Once you click on the link and log in, you can work on the application process steps.</li>
				</ul>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-five" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-five">How can I be sure my application was received?</label>
			<div class="tab-content">
				<p>Once you've submitted your application, you see a confirmation message that you've successfully applied with the organization. You are also sent a confirmation email. To verify the status online, log into your account, and click on the Application tab.</p>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-six" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-six">Can I delete applications I previously submitted?</label>
			<div class="tab-content">
				<p>No. Once the application is submitted to the organization, a record remains in the Application Status area of your account.</p>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-seven" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-seven">How can I get in touch with the organization with which I've applied?</label>
			<div class="tab-content">
				<p>There are several places where you may find an organization's contact information:</p>
				<ul>
					<li>On the organization's website.</li>
					<li>On the job posting (typically at the bottom of the page).</li>
					<li>On your submitted application. Select click here for a printable version of your application and the organization contact information appears at the very top of the page.</li>
				</ul>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-eight" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-eight">I submitted a request reset my password, but I didn't receive an email with instructions. What should I do ?</label>
			<div class="tab-content">
				<p>Click  Contact Us or email Customer Service at xxxx@gigCentral.com or 1 (888) xxx-xxxx.</p>
			</div>
		</div>
		<div class="tab blue">
			<input id="tab-nine" type="checkbox" name="tabs2" class="faq-checkbox">
			<label for="tab-nine">I can't remember my username what should I do ? </label>
			<div class="tab-content">
				<p>Click  Contact Us or email Customer Service at xxxx@gigCentral.com or 1 (888) xxx-xxxx.</p>
			</div>
		</div>
		<div class="tab blue">
		<input id="tab-ten" type="checkbox" name="tabs2" class="faq-checkbox">
		<label for="tab-ten">How do I change my password?</label>
			<div class="tab-content">
				<p>If you wish to change your password, please follow these steps:</p>
				<ol>
					<li>When you are logged in, go to the profiles page </li>
					<li>Select Edit next to the piece of information you wish to update.</li>
					<li>Enter your new information in the appropriate fields.</li>
					<li>Select Save to confirm changes</li>
				</ol>
			</div>
		</div>
 	</div><!-- .half -->
</div><!-- .FAQ-wrapper -->

<?php
$this->load->view($this->config->item('theme').'footer');
?>
