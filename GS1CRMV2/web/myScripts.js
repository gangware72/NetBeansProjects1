/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


            function openNav() {
                document.getElementById("SideNavigation").style.width = "200px";
            }

            function closeNav() {
                document.getElementById("SideNavigation").style.width = "0";
            }
            
            function goHome(){
                 window.location='searchClient.jsp';
             }
             
            function hideDisplay() {
                 var disp = document.getElementById("displayed");
                 disp.style.display = "none";
                 var nudisp = document.getElementById("hidden");
                 nudisp.style.display = "block";
                 var makeChangesButton = document.getElementById("makeChangesButton");
                 makeChangesButton.style.display ="none";
  
             }
             
             function changeFlexContainerToThree(){
                 document.getElementById("displayed").style.columns = "3";

             }
             
             function changeFlexContainerToFour(){
                document.getElementById("displayed").style.columns = "4";

             }
            
        