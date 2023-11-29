$(() => {

$(".flrCAb").on("click", () => {

   let text = `
   
    <thead class="education-list">
        <tr >
        <th scope="col" style="width: 35%;">
            <input type="date" id="datepicker" >
            <span>-</span>
            <input type="date" id="datepicker" >
        </th>
        <th scope="col" style="width: 20%;">
        <select class="form-select">
        <option selected>학력</option>
            <option value="1">고등학교</option>
            <option value="1">대학(2,3년)</option>
            <option value="1">대학교(4년)</option>
            <option value="1">대학원(석사)</option>
            <option value="1">대학원(박사)</option>
        </select>
        </th>
        <th scope="col" style="width: 40%;">
            <input placeholder="학교와 학과명을 입력해주세요" type="text" value="" name="educations.0.schoolName">
        </th>
        <th scope="col" style="width: 5%;">
        <button type="button" class="delete-btn" onclick="close(this)">X</button>
        </th>
        </tr>
    </thead>
    
   `
   $("#education").append(text);

   $(".delete-btn").on("click", function() {
       $(this).parent().parent().parent().remove();
   });

})


// function close(e){
//     $(e).parent().parent().parent().remove();
// }

$(".flrCAb-1").on("click", () => {

    let text = `
    
     <thead class="experience-list">
         <tr >
         <th scope="col" style="width: 35%;">
             <input type="date" id="datepicker" >
             <span>-</span>
             <input type="date" id="datepicker" >
         </th>
         <th scope="col" style="width: 40%;">
             <input placeholder="회사명을 입력해주세요" type="text" value="" name="educations.0.schoolName">
         </th>
         <th scope="col" style="width: 5%;">
         <button type="button" class="delete-btn-1" onclick="close(this)">X</button>
         </th>
         </tr>
     </thead>
     
    `
    $("#experience").append(text);
 
    $(".delete-btn-1").on("click", function() {
        $(this).parent().parent().parent().remove();
    });
 
 })

//  $(".flrCAb-2").on("click", () => {

//     let text = `
    
//      <thead class="education-list">
//          <tr >
//          <th scope="col" style="width: 35%;">
//              <input type="date" id="datepicker" >
//              <span>-</span>
//              <input type="date" id="datepicker" >
//          </th>
//          <th scope="col" style="width: 40%;">
//              <input placeholder="회사명을 입력해주세요" type="text" value="" name="educations.0.schoolName">
//          </th>
//          <th scope="col" style="width: 5%;">
//          <button type="button" class="delete-btn-2" onclick="close(this)">X</button>
//          </th>
//          </tr>
//      </thead>
     
//     `
//     $("#skill").append(text);
 
//     $(".delete-btn-2").on("click", function() {
//         $(this).parent().parent().parent().remove();
//     });
 
//  })

 $(".flrCAb-3").on("click", () => {

    let text = `
    
     <thead class="certification-list">
         <tr >
         <th scope="col" style="width: 35%;">
             <input type="date" id="datepicker" >
             <span>-</span>
             <input type="date" id="datepicker" >
         </th>
         <th scope="col" style="width: 40%;">
             <input placeholder="관련기관을 입력해주세요" type="text" value="" name="educations.0.schoolName">
         </th>
         <th scope="col" style="width: 5%;">
         <button type="button" class="delete-btn-3" onclick="close(this)">X</button>
         </th>
         </tr>
     </thead>
     
    `
    $("#certification").append(text);
 
    $(".delete-btn-3").on("click", function() {
        $(this).parent().parent().parent().remove();
    });
 
 })

 $(".flrCAb-4").on("click", () => {

    let text = `
    
     <thead class="introduce-list">
         <tr >
         <th scope="col" class="introduce_content" style="width: 95%;">
            <input type="text" value="" name="" style="margin-bottom: 10px;" placeholder="소제목을 입력해주세요">
             <p>
             <textarea name="username"
                placeholder="자기소개서 내용을 작성해주세요" class="form-control" style="height: 67px;"></textarea>
         </th>
         <th scope="col" class="introduce_content" style="width: 5%;">
         <button type="button" class="delete-btn-4" onclick="close(this)">X</button>
         </th>
         </tr>
     </thead>
     
    `
    $("#introduce").append(text);
 
    $(".delete-btn-4").on("click", function() {
        $(this).parent().parent().parent().remove();
    });
 
 })

})

  