(ns clojure-noob.core
    (:gen-class)
    (:require [cheshire.core :refer :all]))

(defn -main
      "I don't do a whole lot ... yet."
      [& args]
      (println "Hello, World!"))



;basic program takes in a name parameter and prints a greeting with the name
(defn greet [name] (println (str "hello ", name)))
(greet "bob")

;message shows how to have multiple if statements and an else
(defn error-message [errorType] (println (str "Warning Code " (if (= errorType 1) "1 in action") (if (= errorType 2) "2 in action") (if (= errorType 3) "3 in action")) "No code available"))

;Loop practice code, same as a while loop
(defn loop-practice [number-of-loops] (loop [iteration 0] (println (str "iteration" iteration)) (if (> iteration number-of-loops) (println "Done") (recur (inc iteration)))))

(def practice-atom (atom {:small-number 5
                          :large-number 2001}))

(defn increase-atom-values [atom-state increase-amount]
      (merge-with + atom-state {:small-number increase-amount
                                :large-number increase-amount}))
(def cat-map
  {:id 1
   :name "Fajita"
   :type "Cat"
   :price 70.50
   :colors ["white" "orange" "black" "brown"]
   :born (java.util.Date. 971059433000)})

(defn clojure->json [map]
  (generate-string map))

(defn json->clojure [json]
  (parse-string json true))

(def cat-json (clojure->json cat-map))
;prints several types of error messages when prompted
(error-message 1)
(error-message 2)
(error-message 3)
(error-message 5)
;Does a loop 4 times
(loop-practice 4)

(println "original atom" @practice-atom)
(swap! practice-atom increase-atom-values 10)
(println "current atom after 1 change" @practice-atom)
(swap! practice-atom increase-atom-values 200)
(println "current atom after 2 changes" @practice-atom)
(println (clojure->json cat-map))
(println (json->clojure cat-json))
