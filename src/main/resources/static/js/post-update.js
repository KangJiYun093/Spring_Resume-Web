$(function() {
    $('input[name=birthbtn]').val(post.userBirth.split("T")[0]);

    post.educationDto.forEach(education => {
        let admissionYear = `${education.admissionYear}`.split("T")[0];
        let graduationYear = `${education.graduationYear}`.split("T")[0];

        let text = `
            <tr>
                <th scope="col" style="width: 10%;">
                    <input class="datepicker-input" type="date" id="admission-year" name="admissionYear" value="` + admissionYear + `" readonly>
                </th>
<!--                <th scope="col" style="width: 3%; text-align: center;" font-size: 16px;>-->
<!--                    <span>-</span>-->
<!--                    </th>-->
                <th scope="col" style="width: 10%;">
                    <input class="datepicker-input" type="date" id="graduation-year" name="graduationYear" value="` + graduationYear + `" readonly>
                </th>
                <th scope="col" style="width: 20%;">
                    <input class="datepicker-input" name="educationLevel" value="${education.educationLevel}" readonly>
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
                 <th scope="col" style="width: 10%;">
                     <input class="datepicker-input" type="date" id="experience-start" name="experienceStart" value="` + experienceStart + `" readonly>
                 </th>
<!--                <th scope="col" style="width: 3%; text-align: center;" font-size: 18px;>-->
<!--                    <span>-</span>-->
<!--                    </th>-->
                <th scope="col" style="width: 10%;">
                     <input class="datepicker-input" type="date" id="experience-end" name="experienceEnd" value="` + experienceEnd + `" readonly>
                 </th>
                 <th scope="col" style="width: 60%;">
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
                     <input class="datepicker-input" type="date" id="certification-date" name="certificationDate" value="` + certificationDate + `" readonly>
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

    // $('#save-button').click(function() {
    //     html2canvas($('#pdfDiv')[0]).then(function(canvas) {
    //         // 캔버스를 이미지로 변환
    //         let imgData = canvas.toDataURL('image/png');
    //
    //         let margin = 10; // 출력 페이지 여백설정
    //         let imgWidth = 210 - (10 * 2); // 이미지 가로 길이(mm) A4 기준
    //         let pageHeight = imgWidth * 1.414;  // 출력 페이지 세로 길이 계산 A4 기준
    //         let imgHeight = canvas.height * imgWidth / canvas.width;
    //         let heightLeft = imgHeight;
    //
    //         let doc = new jsPDF('p', 'mm','a4');
    //         let position = margin;
    //
    //         // 첫 페이지 출력
    //         doc.addImage(imgData, 'PNG', margin, position, imgWidth, imgHeight);
    //         heightLeft -= pageHeight;
    //
    //         // 한 페이지 이상일 경우 루프 돌면서 출력
    //         // 추가 페이지 출력
    //         while (heightLeft > 0) {
    //             position = pageHeight - (imgHeight - heightLeft);
    //             doc.addPage();
    //             doc.addImage(imgData, 'PNG', margin, position, imgWidth, imgHeight);
    //             heightLeft -= pageHeight;
    //         }
    //
    //         // 파일 저장
    //         doc.save('sample.pdf');
    //     });
    // });


    function capture() {
        $('#save-button').css({display: "none"});
        // HTML2Canvas 실행
        html2canvas(document.body).then(canvas => {

            // Canvas를 이미지로 변환하고 PDF로 저장
            const imgData = canvas.toDataURL('image/png');
            const pdf = new jsPDF('p', 'mm', 'a4');
            pdf.addImage(imgData, 'PNG', 0, 0, pdf.internal.pageSize.width, pdf.internal.pageSize.height);

            // PDF를 다운로드
            pdf.save('sample.pdf')
        });
    }


});