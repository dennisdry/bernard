$(document).ready(function () {

    $(".reply-action").click(function () {
        $(this).closest(".replies").slideToggle("slow");
    });

    $("#mobile-menu-button").click(function () {
        $("#mobile-menu-open").slideToggle("slow");
    });

    $("#pitch-script-messages").click(function () {

        $('#pitch-discuss-1').delay(2000).fadeIn(500, function(){
            $(this).removeAttr("style");
        });

        $('#mainchat-comment-1').delay(3000).fadeIn(500, function(){
            $(this).html(' 1 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-1').delay(4000).fadeIn(500, function(){
            $(this).html(' 2 <span class="hidden-md-down">comments</span>');
        });


        $('#pitch-discuss-2').delay(5000).fadeIn(500, function(){
            $(this).removeAttr("style");
        });

        $('#mainchat-comment-2').delay(6000).fadeIn(500, function(){
            $(this).html(' 1 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-2').delay(6500).fadeIn(500, function(){
            $(this).html(' 2 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-2').delay(8000).fadeIn(500, function(){
            $(this).html(' 3 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-2').delay(6000).fadeIn(500, function(){
            $(this).html(' 4 <span class="hidden-md-down">comments</span>');
        });

        $('#pitch-discuss-3').delay(10000).fadeIn(500, function(){
            $(this).removeAttr("style");
        });

        $('#mainchat-comment-3').delay(12000).fadeIn(500, function(){
            $(this).html(' 1 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-3').delay(16000).fadeIn(500, function(){
            $(this).html(' 2 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-3').delay(16700).fadeIn(500, function(){
            $(this).html(' 3 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-3').delay(18000).fadeIn(500, function(){
            $(this).html(' 4 <span class="hidden-md-down">comments</span>');
        });

        $('#mainchat-comment-3').delay(19000).fadeIn(500, function(){
            $(this).html(' 5 <span class="hidden-md-down">comments</span>');
        });

    });
});

