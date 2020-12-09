package info.tomfi;

import io.jooby.Jooby;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

public class App extends Jooby {
  public App() {
    get("/singletest", ctx -> Single.just("Tested"));
    get("/flowabletest", ctx -> Flowable.just("Tested"));
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }
}
