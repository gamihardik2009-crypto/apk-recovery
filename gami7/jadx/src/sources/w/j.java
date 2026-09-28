package w;

import V.n;
import android.graphics.Rect;
import android.view.View;
import m2.C0880v;
import q2.InterfaceC1073d;
import t0.AbstractC1248f;
import t0.InterfaceC1255m;
import t0.Z;

/* loaded from: classes.dex */
public final class j implements InterfaceC1371a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1255m f11431h;

    public j(n nVar) {
        this.f11431h = nVar;
    }

    @Override // w.InterfaceC1371a
    public final Object n0(Z z3, y2.a aVar, InterfaceC1073d interfaceC1073d) {
        View x2 = AbstractC1248f.x(this.f11431h);
        long K3 = z3.K(0L);
        b0.d dVar = (b0.d) aVar.c();
        b0.d i2 = dVar != null ? dVar.i(K3) : null;
        if (i2 != null) {
            x2.requestRectangleOnScreen(new Rect((int) i2.f7060a, (int) i2.f7061b, (int) i2.f7062c, (int) i2.f7063d), false);
        }
        return C0880v.f8657a;
    }
}
