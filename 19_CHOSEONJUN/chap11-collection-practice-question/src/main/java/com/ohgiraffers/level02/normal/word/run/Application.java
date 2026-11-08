package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

public class Application {

    public static void main(String[] args) {


        ///        // 1. WordCounter로 문장의 단어별 횟수를 센다
        ///
        ///         // 2. 단어별 횟수를 한 줄씩 출력하면서 가장 많이 나온 단어를 찾는다
        ///
        ///         // 3. 가장 많이 나온 단어와 횟수를 출력한다

        ///문장 java is fun and java is powerful java의 단어별 횟수를 <단어> : <횟수>로 한 줄씩 출력한다.
        /// 출력하면서 가장 많이 나온 단어를 찾아 마지막에 가장 많은 단어 : <단어> (<횟수>번)을 출력한다.

        WordCounter wordCounter = new WordCounter();
        wordCounter.count("java is fun and java is powerful java");


        ///and : 1
        /// fun : 1
        /// is : 2
        /// java : 3
        /// powerful : 1
        /// 가장 많은 단어 : java (3번)
    }
}
