package C2;

import C1.y;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import n2.AbstractC0948C;
import u0.Y;

/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f707a;

    public /* synthetic */ b(int i2) {
        this.f707a = i2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f707a) {
            case 0:
                return new Random();
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread".toString());
                }
                Y y3 = new Y(choreographer, y.m(myLooper));
                return AbstractC0948C.n(y3, y3.f11015s);
        }
    }
}
