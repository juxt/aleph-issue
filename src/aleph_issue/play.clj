(ns aleph-issue.play
  (:require
   [aleph.http :as http]
   [manifold.stream :as ms]))

(defn handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Hi!\r\n"})

(def server (http/start-server handler {:port 8080}))

;; Start the server, as above, then call .close on the result, then start up again.
;; curl then seems to hang.
;; (.close server)
