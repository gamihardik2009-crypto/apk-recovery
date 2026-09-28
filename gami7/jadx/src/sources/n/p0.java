package n;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class p0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f8826a = new p0();

    @Override // n.l0
    public final k0 a(View view, boolean z3, long j3, float f3, float f4, boolean z4, O0.b bVar, float f5) {
        if (z3) {
            return new o0(new Magnifier(view));
        }
        long G3 = bVar.G(j3);
        float P2 = bVar.P(f3);
        float P3 = bVar.P(f4);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (G3 != 9205357640488583168L) {
            builder.setSize(B2.a.D(b0.f.d(G3)), B2.a.D(b0.f.b(G3)));
        }
        if (!Float.isNaN(P2)) {
            builder.setCornerRadius(P2);
        }
        if (!Float.isNaN(P3)) {
            builder.setElevation(P3);
        }
        if (!Float.isNaN(f5)) {
            builder.setInitialZoom(f5);
        }
        builder.setClippingEnabled(z4);
        return new o0(builder.build());
    }

    @Override // n.l0
    public final boolean b() {
        return true;
    }
}
