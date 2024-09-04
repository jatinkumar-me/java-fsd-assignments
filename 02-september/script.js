async function fetchUsers() {
    const userGrid = document.getElementById('user-grid');
    userGrid.innerHTML = "<h1>Loading...</h1>"
    try {
        userGrid.innerHTML = "";
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const users = await response.json();
        users.forEach(user => {
            const card = document.createElement('div');
            card.className = 'card';
            card.innerHTML = `
                        <h2>${user.name}</h2>
                        <p><strong>Username:</strong> ${user.username}</p>
                        <p><strong>Email:</strong> ${user.email}</p>
                        <p><strong>Address:</strong> ${user.address.street}, ${user.address.suite}, ${user.address.city}, ${user.address.zipcode}</p>
                        <p><strong>Phone:</strong> ${user.phone}</p>
                        <p><strong>Website:</strong> <a href="http://${user.website}" target="_blank">${user.website}</a></p>
                        <p><strong>Company:</strong> ${user.company.name}</p>
                    `;
            userGrid.appendChild(card);
        })
    } catch {
        userGrid.innerHTML = "";
        console.error('Error fetching users:', error);
    }
}


fetchUsers();
