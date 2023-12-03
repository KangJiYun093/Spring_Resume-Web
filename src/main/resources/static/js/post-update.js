$(function() {
    $('input[name=birthbtn]').val(post.userBirth.split("T")[0]);

    post.educationDto.forEach(education => {
        let admissionYear = `${education.admissionYear}`.split("T")[0];
        let graduationYear = `${education.graduationYear}`.split("T")[0];

        let text = `
            <tr>
                <th scope="col" style="width: 35%;">
                    <input type="date" id="admission-year" name="admissionYear" value="` + admissionYear + `" readonly>
                    <span>-</span>
                    <input type="date" id="graduation-year" name="graduationYear" value="` + graduationYear + `" readonly>
                </th>
                <th scope="col" style="width: 20%;">
                    <input class="form-select" name="educationLevel" value="${education.educationLevel}" readonly>
<!--                        <option>학력</option>-->
<!--                        <option value="고등학교">고등학교</option>-->
<!--                        <option value="대학(2,3년)">대학(2,3년)</option>-->
<!--                        <option value="대학교(4년)">대학교(4년)</option>-->
<!--                        <option value="대학원(석사)">대학원(석사)</option>-->
<!--                        <option value="대학원(박사)">대학원(박사)</option>-->
<!--                    </input>-->
                </th>
                <th scope="col" style="width: 40%;">
                    <input placeholder="학교와 학과명을 입력해주세요" type="text" value="${education.educationBackground}" id="education-background"  name="educationBackground" readonly>
                </th>
            </tr>
        `;

        $('.education-list').append(text);
    });

    post.experienceDto.forEach(experience => {
        let experienceStart = `${experience.startDate}`.split("T")[0];
        let experienceEnd = `${experience.endDate}`.split("T")[0];
        let text = `
             <tr >
                 <th scope="col" style="width: 35%;">
                     <input type="date" id="experience-start" name="experienceStart" value="` + experienceStart + `" readonly>
                     <span>-</span>
                     <input type="date" id="experience-end" name="experienceEnd" value="` + experienceEnd + `" readonly>
                 </th>
                 <th scope="col" style="width: 40%;">
                     <input placeholder="회사명을 입력해주세요" type="text" value="${experience.companyNameDepart}" name="companyName" readonly>
                 </th>
             </tr>
        `;
        $(".experience-list").append(text);
    });

    post.certificationDto.forEach(certification => {
        let certificationDate = `${certification.certificationDate}`.split("T")[0];
        let text = `
             <tr >
                 <th scope="col" style="width: 25%;">
                     <input type="date" id="certification-date" name="certificationDate" value="` + certificationDate + `" readonly>
                 </th>
                 <th scope="col" style="width: 30%;">
                     <input placeholder="자격증명을 입력해주세요" type="text" value="${certification.certificationName}" name="certificationName" readonly>
                 </th>
                 <th scope="col" style="width: 40%;">
                     <input placeholder="관련기관을 입력해주세요" type="text" value="${certification.certificationAuthority}" name="checkCompanyName" readonly>
                 </th>
             </tr>
        `;
        $(".certification-list").append(text);
    });

    post.introduceDto.forEach(introduce => {
        let text = `
             <tr>
                 <th scope="col" class="introduce_content" style="width: 95%;">
                    <input type="text" value="${introduce.introduceTitle}" name="introduceTitle" style="margin-bottom: 10px;" placeholder="소제목을 입력해주세요" readonly>
                     <p>
                     <input name="introduceContent" placeholder="자기소개서 내용을 작성해주세요" class="form-control" style="height: 67px;" value="${introduce.introduceContent}" readonly></input>
                 </th>
             </tr>
        `;
        $(".introduce-list").append(text);
    });
});