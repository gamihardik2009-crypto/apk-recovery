package n;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class m0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f8811a;

    public m0(Magnifier magnifier) {
        this.f8811a = magnifier;
    }

    @Override // n.k0
    public void a(long j3, long j4, float f3) {
        this.f8811a.show(b0.c.d(j3), b0.c.e(j3));
    }

    public final void b() {
        this.f8811a.dismiss();
    }

    public final long c() {
        return l0.c.e(this.f8811a.getWidth(), this.f8811a.getHeight());
    }

    public final void d() {
        this.f8811a.update();
    }
}
