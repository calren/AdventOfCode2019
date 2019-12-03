import java.lang.Exception

fun main() {
//    runOpCode(intArrayOf(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 19, 10, 23, 1, 23, 13, 27, 1, 6, 27, 31, 1, 9, 31, 35, 2, 10, 35, 39, 1, 39, 6, 43, 1, 6, 43, 47, 2, 13, 47, 51, 1, 51, 6, 55, 2, 6, 55, 59, 2, 59, 6, 63, 2, 63, 13, 67, 1, 5, 67, 71, 2, 9, 71, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 83, 6, 87, 1, 87, 6, 91, 1, 91, 5, 95, 2, 10, 95, 99, 1, 5, 99, 103, 1, 10, 103, 107, 1, 107, 9, 111, 2, 111, 10, 115, 1, 115, 9, 119, 1, 13, 119, 123, 1, 123, 9, 127, 1, 5, 127, 131, 2, 13, 131, 135, 1, 9, 135, 139, 1, 2, 139, 143, 1, 13, 143, 0, 99, 2, 0, 14, 0),
//            12,
//            2)

    findNounAndVerb(intArrayOf(1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 19, 10, 23, 1, 23, 13, 27, 1, 6, 27, 31, 1, 9, 31, 35, 2, 10, 35, 39, 1, 39, 6, 43, 1, 6, 43, 47, 2, 13, 47, 51, 1, 51, 6, 55, 2, 6, 55, 59, 2, 59, 6, 63, 2, 63, 13, 67, 1, 5, 67, 71, 2, 9, 71, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 83, 6, 87, 1, 87, 6, 91, 1, 91, 5, 95, 2, 10, 95, 99, 1, 5, 99, 103, 1, 10, 103, 107, 1, 107, 9, 111, 2, 111, 10, 115, 1, 115, 9, 119, 1, 13, 119, 123, 1, 123, 9, 127, 1, 5, 127, 131, 2, 13, 131, 135, 1, 9, 135, 139, 1, 2, 139, 143, 1, 13, 143, 0, 99, 2, 0, 14, 0))

}

fun findNounAndVerb(program: IntArray) {
//    print(program.size)

    for (noun in 0..153) {
        for (verb in 0..153) {
            try {
                if (runOpCode(program.copyOf(), noun, verb) == 19690720) {
                    print(noun.toString() + " " + verb)
                }
            } catch (e: Exception) {
//                println(noun.toString() + " " + verb + " " + copy[0])
                continue
            }
        }
    }

    print("womp")
}


fun runOpCode(program: IntArray, noun: Int, verb: Int): Int {
    program[1] = noun
    program[2] = verb


    var currentStartingIndex = 0

    while (program[currentStartingIndex] != 99) {
        if (program[currentStartingIndex] == 1) {
            program[program[currentStartingIndex + 3]] = program[program[currentStartingIndex + 1]] + program[program[currentStartingIndex + 2]]
        } else if (program[currentStartingIndex] == 2) {
            program[program[currentStartingIndex + 3]] = program[program[currentStartingIndex + 1]] * program[program[currentStartingIndex + 2]]
        } else {
//            print("Something went wrong")
        }
        currentStartingIndex += 4

//        println(program.contentToString())
    }

    return program[0]
}