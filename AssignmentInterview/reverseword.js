function reverseWordsInSentence(sentence) {
    let words = sentence.split(' ');
    let reversedSentence = '';

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = '';

        for (let j = word.length - 1; j >= 0; j--) {
            reversedWord += word[j];
        }

        reversedSentence += reversedWord;

        if (i < words.length - 1) {
            reversedSentence += ' ';
        }
    }

    return reversedSentence;
}

let sentence = "This is a sunny day";
let result = reverseWordsInSentence(sentence);
console.log(result);  // Output: shiT si a ynnus yad
