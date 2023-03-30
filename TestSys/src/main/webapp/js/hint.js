$(document).ready(function(){

    $('.text')
      .blur(function(){
        var $$=$(this);
        if($$.val()=='' || $$.val()==$$.attr('title') + '  '){
          $$.css('color', '#999999')
            .val($$.attr('title') + '  ');
        }
      })
      .focus(function(){
        var $$=$(this);
        $$.css('color', '#000000');
        if($$.val()==$$.attr('title') + '  '){
          $$.val('');
        }
      })
      .parents('form:first').submit(function(){
        $('.text').each(function(){
          var $$=$(this);
          if($$.val()==$$.attr('title') + '  '){
            $$.triggerHandler('focus');
          }
        });
      }).end()
      .blur();
      $('input[name=email]').change(function(){
        $('input[name=email2]').val('');
      });
  
      
      var DATA_PREF = $('#data_prefecture');
      var PREF_INPUT = $('#prefecture_input');
      var PREF_SELECT = $('#prefecture_select');
  
      
      function isShow( obj ){
          if( obj.css('display') == 'none' ){
              return false;
          }
          return true;
      }
  
      
      function showInput(){
              PREF_INPUT.show().attr('name', 'prefecture');
              PREF_SELECT.hide().attr('name', 'prefecture_select');
      }
  
     
      function showSelect(){
              PREF_INPUT.hide().attr('name', 'prefecture_input');
              PREF_SELECT.show().attr('name', 'prefecture');
      }
  
      
      function setPrefs( prefs ){
          PREF_SELECT.children().remove(); 
          
          PREF_SELECT.append('<option value="">' + DATA_PREF.attr("message") + '</option>')
      
          prefs.children().each(function(){
              var val = this.firstChild.nodeValue;  
              PREF_SELECT.append('<option value="' + val + '">' + val + '</option>');
          });
      }
  
      
      function changeCountry(){
          var country = $(this).val();
          if(country == ""){
              showInput();
              return;
          }
          var prefs = DATA_PREF.children("[name=" + country + "]");
          if(prefs.size() == 0 ){
              
              showInput();
          }else{
              
              setPrefs(prefs);
              showSelect();
          }
      }
  
      
      $('select[name=country]').change( changeCountry ).change();
  
     
      if( PREF_INPUT.val() != '' && isShow(PREF_SELECT) ){
          var val = PREF_INPUT.val();
          PREF_INPUT.val('');			
          PREF_SELECT.val(val);
      }
  
  });
  