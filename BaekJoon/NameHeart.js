function spaceToHeart(text) {
    let result = "";
    for (let i = 0; i<text.length; i++) {
        if (text[i] === " ") {
            result += "◆";
        }
        else {
            result += text[i];
        }
    }
    return result;
}