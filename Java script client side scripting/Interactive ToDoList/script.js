document.getElementById('addTaskButton').addEventListener('click', function() {
    let taskInput = document.getElementById('taskInput');
    let task = taskInput.value;
    
    if (task !== "") {
        let li = document.createElement('li');
        li.textContent = task;
        li.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'align-items-center');
        
        
        let deleteButton = document.createElement('button');
        deleteButton.textContent = "Delete";
        deleteButton.classList.add('btn', 'btn-danger', 'btn-sm');
        deleteButton.addEventListener('click', function() {
            li.remove();
        });

        li.appendChild(deleteButton);
        document.getElementById('taskList').appendChild(li);
        taskInput.value = ""; 
    }
});
