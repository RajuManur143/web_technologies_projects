let reg = document.querySelector("#register");
let ddown = document.querySelector("#ddown");

reg.addEventListener("mouseover", () => {
    ddown.style.display = "block";
});

reg.addEventListener("mouseout", () => {
    ddown.style.display = "none";
});