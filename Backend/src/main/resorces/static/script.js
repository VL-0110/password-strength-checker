async function checkStrength() {
    const password = document.getElementById("password").value;
    const resultElement = document.getElementById("result");

    if (!password) {
        resultElement.textContent = "⚠️ Please enter a password!";
        return;
    }

    try {
        const response = await fetch(`/check?password=${encodeURIComponent(password)}`);
        const strength = await response.text();
        resultElement.textContent = `Strength: ${strength}`;
    } catch (error) {
        resultElement.textContent = "❌ Error connecting to server.";
        console.error(error);
    }
}

