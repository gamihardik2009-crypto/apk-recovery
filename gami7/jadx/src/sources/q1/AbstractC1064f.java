package q1;

import I0.E;
import android.view.Choreographer;

/* renamed from: q1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1064f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new E(runnable, 1));
    }
}
