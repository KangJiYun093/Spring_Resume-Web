$(() => {

    $(".flrCAb").on("click", () => {
       let text = `
            <tr>
                <th scope="col" style="width: 35%;">
                    <input type="date" id="admission-year" name="admissionYear">
                    <span>-</span>
                    <input type="date" id="graduation-year" name="graduationYear">
                </th>
                <th scope="col" style="width: 20%;">
                <select class="form-select" name="educationLevel">
                    <option>학력</option>
                    <option value="고등학교">고등학교</option>
                    <option value="대학(2,3년)">대학(2,3년)</option>
                    <option value="대학교(4년)">대학교(4년)</option>
                    <option value="대학원(석사)">대학원(석사)</option>
                    <option value="대학원(박사)">대학원(박사)</option>
                </select>
                </th>
                <th scope="col" style="width: 40%;">
                    <input placeholder="학교와 학과명을 입력해주세요" type="text" value="" id="education-background"  name="educationBackground">
                </th>
                <th scope="col" style="width: 5%;">
                    <button type="button" class="delete-btn" onclick="close(this)">X</button>
                </th>
            </tr>
       `;

       $(".education-list").append(text);

       $(".delete-btn").on("click", function() {
           // $(this).parent().parent().remove();
           admissionYearLength = $('input[name=admissionYear]').length;

           let admissionYears = new Array(admissionYearLength);

           for(let i = 0; i < admissionYearLength; i++) {
               admissionYears[i] = $('input[name=admissionYear]').eq(i).val();
           }
       });
    });

    $(".flrCAb-1").on("click", () => {

        let text = `
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
        `;
        $(".experience-list").append(text);

        $(".delete-btn-1").on("click", function() {
            $(this).parent().parent().parent().remove();
        });
     });

     $(".flrCAb-3").on("click", () => {
        let text = `
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
        `;
        $(".certification-list").append(text);

        $(".delete-btn-3").on("click", function() {
            $(this).parent().parent().parent().remove();
        });
     });

     $(".flrCAb-4").on("click", () => {

        let text = `
             <tr>
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
        `;
        $(".introduce-list").append(text);

        $(".delete-btn-4").on("click", function() {
            $(this).parent().parent().parent().remove();
        });
     });

     $('#education').datepicker({
        format: 'dd-mm-yyyy',
        autoclose: true
    });


});