package z0;

import A0.q;
import B.u;
import D0.n;
import J2.B;
import J2.l0;
import J2.p0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import c0.AbstractC0571K;
import java.util.function.Consumer;
import n0.C0919B;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final q f11872a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.i f11873b;

    /* renamed from: c, reason: collision with root package name */
    public final j f11874c;

    /* renamed from: d, reason: collision with root package name */
    public final O2.e f11875d;

    /* renamed from: e, reason: collision with root package name */
    public final n f11876e;

    public f(q qVar, O0.i iVar, O2.e eVar, j jVar) {
        this.f11872a = qVar;
        this.f11873b = iVar;
        this.f11874c = jVar;
        this.f11875d = new O2.e(eVar.f5175h.A(g.f11877h));
        this.f11876e = new n(iVar.f5146d - iVar.f5144b, new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z0.f r11, android.view.ScrollCaptureSession r12, O0.i r13, q2.InterfaceC1073d r14) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.a(z0.f, android.view.ScrollCaptureSession, O0.i, q2.d):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        B.r(this.f11875d, l0.f4414i, 0, new C1435a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        p0 r3 = B.r(this.f11875d, null, 0, new C1436b(this, scrollCaptureSession, rect, consumer, null), 3);
        r3.g(new C0919B(23, cancellationSignal));
        cancellationSignal.setOnCancelListener(new u(1, r3));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC0571K.x(this.f11873b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f11876e.f974b = 0.0f;
        j jVar = this.f11874c;
        jVar.f11883a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
