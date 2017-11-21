(ns clojure-noob.core
  (:gen-class))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;basic program takes in a name parameter and prints a greeting with the name
(defn greet [name] (println(str "hello ", name)))
(greet "bob")

;message shows how to have multiple if statements and an else
(defn error-message [errorType] (println(str "Warning Code " (if (= errorType 1) "1 in action") (if (= errorType 2)"2 in action") (if (= errorType 3) "3 in action"))"No code available"))

;Loop practice code, same as a while loop
(defn loop-practice [number-of-loops] (loop [iteration 0] (println (str "iteration" iteration)) (if (> iteration number-of-loops) (println "Done")(recur (inc iteration)))))

;prints several types of error messages when prompted
(error-message 1)
(error-message 2)
(error-message 3)
(error-message 5)
;Does a loop 7 times
(loop-practice 7)

