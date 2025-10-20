package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<TiGiaListener> listeners = new ArrayList<>();
    public void attach(TiGiaListener listener){
        listeners.add(listener);
    }

    public void detach(TiGiaListener listener){
        listeners.remove(listener);
    }

    public void thayDoiTiGia(float delta){
        for(var listener : listeners){
            listener.listen(delta);
        }
    }

    public static interface TiGiaListener{
        void listen(float delta);
    }
}
