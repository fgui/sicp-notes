(ns sicp.ex1-12)

(defn pt [x y]
  (if (or (= x 1) (= x y)) 1
      (+ (pt (dec x) (dec y)) (pt x (dec y)))))

(defn pt-line [y]
  (map #(pt (inc %) y) (range y)))

(pt 1 1)

(pt 1 2)
(pt 2 2)

(pt 1 3)
(pt 2 3)
(pt 3 3)

(pt-line 4)
(pt-line 5)

(map pt-line (range 1 10))
