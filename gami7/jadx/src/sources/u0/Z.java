package u0;

import J.C0278m0;
import J2.C0311h;
import J2.InterfaceC0310g;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class Z implements Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0310g f11016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.c f11017i;

    public Z(C0311h c0311h, C0278m0 c0278m0, y2.c cVar) {
        this.f11016h = c0311h;
        this.f11017i = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object n3;
        try {
            n3 = this.f11017i.l(Long.valueOf(j3));
        } catch (Throwable th) {
            n3 = C1.y.n(th);
        }
        this.f11016h.t(n3);
    }
}
