$(() => {

    $(".flrCAb").on("click", () => {
       let text = `
            <tr>
                <th scope="col" style="width: 35%;">
                    <input class="datepicker-input" type="date" id="admission-year" name="admissionYear">
                    <span>-</span>
                    <input class="datepicker-input" type="date" id="graduation-year" name="graduationYear">
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
           $(this).parent().parent().remove();
       });
    });

    $(".flrCAb-1").on("click", () => {
        let text = `
             <tr >
             <th scope="col" style="width: 35%;">
                 <input class="datepicker-input" type="date" id="datepicker" >
                 <span>-</span>
                 <input class="datepicker-input" type="date" id="datepicker" >
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
            $(this).parent().parent().remove();
        });
     });

     $(".flrCAb-3").on("click", () => {
        let text = `
             <tr >
             <th scope="col" style="width: 25%;">
                 <input class="datepicker-input" type="date" id="datepicker" >
             </th>
             <th scope="col" style="width: 30%;">
                 <input placeholder="자격증명을 입력해주세요" type="text" value="" name="educations.0.schoolName">
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
            $(this).parent().parent().remove();
        });
     });

     $(".flrCAb-4").on("click", () => {

        let text = `
             <tr>
                 <th scope="col" class="introduce_content" style="width: 95%;">
                    <input type="text" value="" name="introduceTitle" style="margin-bottom: 10px;" placeholder="소제목을 입력해주세요">
                     <p>
                     <input name="introduceContent" placeholder="자기소개서 내용을 작성해주세요" class="form-control" style="height: 67px;"></input>
                 </th>
                 <th scope="col" class="introduce_content" style="width: 5%;">
                    <button type="button" class="delete-btn-4" onclick="close(this)">X</button>
                 </th>
             </tr>
        `;
        $(".introduce-list").append(text);

        $(".delete-btn-4").on("click", function() {
            $(this).parent().parent().remove();
        });
     });

    $('#save-button').on('click', function() {
        // 학력사항
        admissionYearLength = $('input[name=admissionYear]').length;
        let admissionYears = new Array(admissionYearLength);

        for(let i = 0; i < admissionYearLength; i++) {
            admissionYears[i] = $('input[name=admissionYear]').eq(i).val();
        }

        graduationYearLength = $('input[name=graduationYear]').length;
        let graduationYears = new Array(graduationYearLength);

        for(let i = 0; i < graduationYearLength; i++) {
            graduationYears[i] = $('input[name=graduationYear]').eq(i).val();
        }

        educationLevelLength = $('select[name=educationLevel]').length;
        let educationLevels = new Array(educationLevelLength);

        for(let i = 0; i < educationLevelLength; i++) {
            educationLevels[i] = $('select[name=educationLevel]').eq(i).val();
        }

        educationBackgroundLength = $('input[name=educationBackground]').length;
        let educationBackgrounds = new Array(educationBackgroundLength);

        for(let i = 0; i < educationBackgroundLength; i++) {
            educationBackgrounds[i] = $('input[name=educationBackground]').eq(i).val();
        }


        // 경력사항
        experienceStartLength = $('input[name=experienceStart]').length;
        let experienceStarts = new Array(experienceStartLength);

        for(let i = 0; i < experienceStartLength; i++) {
            experienceStarts[i] = $('input[name=experienceStart]').eq(i).val();
        }

        experienceEndLength = $('input[name=experienceEnd]').length;
        let experienceEnds = new Array(experienceEndLength);

        for(let i = 0; i < experienceEndLength; i++) {
            experienceEnds[i] = $('input[name=experienceEnd]').eq(i).val();
        }

        companyNameLength = $('input[name=companyName]').length;
        let companyNames = new Array(companyNameLength);

        for(let i = 0; i < companyNameLength; i++) {
            companyNames[i] = $('input[name=companyName]').eq(i).val();
        }

    //  자격증
        certificationDateLength = $('input[name=certificationDate]').length;
        let certificationDates = new Array(certificationDateLength);

        for(let i = 0; i < certificationDateLength; i++) {
            certificationDates[i] = $('input[name=certificationDate]').eq(i).val();
        }

        certificationNameLength = $('input[name=certificationName]').length;
        let certificationNames = new Array(certificationNameLength);

        for(let i = 0; i < certificationNameLength; i++) {
            certificationNames[i] = $('input[name=certificationName]').eq(i).val();
        }

        checkCompanyNameLength = $('input[name=checkCompanyName]').length;
        let checkCompanyNames = new Array(checkCompanyNameLength);

        for(let i = 0; i < checkCompanyNameLength; i++) {
            checkCompanyNames[i] = $('input[name=checkCompanyName]').eq(i).val();
        }

    //     자기소개서
        introduceTitleLength = $('input[name=introduceTitle]').length;
        let introduceTitles = new Array(introduceTitleLength);

        for(let i = 0; i < introduceTitleLength; i++) {
            introduceTitles[i] = $('input[name=introduceTitle]').eq(i).val();
        }

        introduceContentLength = $('input[name=introduceContent]').length;
        let introduceContents = new Array(introduceContentLength);

        for(let i = 0; i < introduceContentLength; i++) {
            introduceContents[i] = $('input[name=introduceContent]').eq(i).val();
        }

        $.ajax({
            url: "/post/post-write",
            type: "post",
            dataType : 'json',
            traditional: true,
            data: { title : $('textarea[name=title]').val(), username : $('textarea[name=username]').val(), email : $('input[name=email]').val(),
                birthbtn : $('input[name=birthbtn]').val(), simplePr: $('textarea[name=simplePr]').val(),
                phoneNumber : $('input[name=phoneNumber]').val(), admissionYears : admissionYears, graduationYears : graduationYears,
                educationLevels : educationLevels, educationBackgrounds : educationBackgrounds, experienceStarts : experienceStarts,
                experienceEnds : experienceEnds, companyNames : companyNames, certificationDates : certificationDates,
                certificationNames : certificationNames, checkCompanyNames : checkCompanyNames, introduceTitles : introduceTitles,
                introduceContents : introduceContents },
            success: function() {
                location.href = "/post/post-list2";
            }
        });

        location.href = "/post/post-list2";
    });
});