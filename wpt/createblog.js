function blog()
    {
         let parentdiv=document.querySelector("#parent");

         let childtag=parentdiv.innerHTML;
         let tital1= document.querySelector("#id1").value;

         let author= document.querySelector("#id2").value;
           
         let text1= document.querySelector("#id3").value;

         let newchild=`<div class="card col-3 p-0 m-5 my-4 mx-4 shadow-lg p-3 mb-5 bg-dark bg-opacity-75 text-white  rounded">
           
         <div class="card-header text-capitalize h3 bg-primary bg-opacity-10 d-flex justify-content-center fs-1">${tital1}</div>
         <div class="card-body p-0">
              <img class="object-fit-cover w-100 h-50 " src="https://picsum.photos/200"  alt="">
              
              <div class="bg-primary text-capitalize h5 fw-bold bg-opacity-10"> Author : ${author}</div>

              <div class="bg-primary  bg-opacity-10" style="height:120px; overflow-y: auto" >${text1}</div>

             <span class="fs-1" onclick="inc(this)">&#128151;</span>
      <span>0</span>
      <span class="fs-1" onclick="dec(this)">&#128544;</span>
      <span>0</span>
         </div>          
         </div>
     </div>`;
     parentdiv.innerHTML=`${childtag} ${newchild}`;

        if(tital1.length< 3)
         {
            document.querySelector("#id1").classList.add("border-3");
            document.querySelector("#id1").classList.add("border.darnger");
          }
         
              else{
                document.querySelector("#id1").classList.remove("border.darnger");
             }      

         if(text1.length <3)
         {

           document.querySelector("#id2").classList.add("border.darnger");
         }
         
             else{
                document.querySelector("#id2").classList.remove("border.darnger");
             }
             document.querySelector("#id1").value = "";
             document.querySelector("#id2").value = "";
             document.querySelector("#id3").value = "";
    }

