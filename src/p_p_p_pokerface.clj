(ns p-p-p-pokerface)

(defn rank [card]
  (let [[rank _] card
        ranks {\T 10,
               \J 11,
               \Q 12,
               \K 13,
               \A 14, }] 
    (if (Character/isDigit rank)
      (Integer/valueOf (str rank))
      (ranks rank)))
  )

(defn suit [card]
  (let [[_ suit] card]
    (str suit))
  )

(defn pair? [hand]
  nil)

(defn three-of-a-kind? [hand]
  nil)

(defn four-of-a-kind? [hand]
  nil)

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  nil)

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
