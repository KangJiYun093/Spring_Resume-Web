$(() => {

    posts.forEach(post => {
        let regTime = `${post.regTime}`.replace("T", " ");

        let text = `
            <li class="list-content-box">
                <a href="/post/post-update/${post.postId}">
                    <input type="hidden" class="post-id" value="${post.postId}">
                    <div class="list-content-card">
                        <div class="card-title">
                            <h2>
                                ${post.postTitle}
                            </h2>
                            <span style="display: flex;">
                                <button type="button" class="card-delete">X</button>
                            </span>
                        </div>
                        <div class="card-date">
                            <span>
                                ` + regTime + `
                                등록
                            </span>
                        </div>
                    </div>
                </a>
            </li>
        `;

        $('.list-content').append(text);

    });
    addPost();

    function addPost() {
        let text = `
            <li class="list-content-box">
                <div class="list-content-card-add">
                    <button type="button">
                        <span style="display: flex;">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" 
                            viewBox="0 0 20 20">
                            <path fill="#00DD6D" fill-rule="evenodd" 
                            d="M10 20c5.523 0 10-4.477 10-10S15.523 0 10 0 0 4.477 0 10s4.477 10 10 10ZM9 9V5.5h2V9h3.5v2H11v3.5H9V11H5.5V9H9Z" 
                            clip-rule="evenodd">
                            </path>
                            </svg>
                        </span>
                    </button>
                    <p>새로운 이력서를 추가해보세요!</p>
                </div>
            </li>
        `;

        $('.list-content').append(text);
    }

    $('.card-delete').on('click', function(e) {
        e.preventDefault();
        if(!confirm("정말 삭제하시겠습니까?")) {
            return;
        }

        let deleteId = $(this).parent().parent().parent().prev().val();

        $.ajax({
            url: "/post/post-delete",
            type: "post",
            data: { postId : deleteId },
            success: function() {
                document.location.reload();
            }
        });
    });

    $(".list-content-card-add").on("click", () => {
        location.href="/post/post-write";
    });
});