package J;

import java.util.concurrent.CancellationException;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class T implements A0 {

    /* renamed from: h, reason: collision with root package name */
    public final y2.e f4089h;

    /* renamed from: i, reason: collision with root package name */
    public final O2.e f4090i;

    /* renamed from: j, reason: collision with root package name */
    public J2.p0 f4091j;

    public T(InterfaceC1078i interfaceC1078i, y2.e eVar) {
        this.f4089h = eVar;
        this.f4090i = J2.B.a(interfaceC1078i);
    }

    @Override // J.A0
    public final void a() {
        J2.p0 p0Var = this.f4091j;
        if (p0Var != null) {
            p0Var.a(new V());
        }
        this.f4091j = null;
    }

    @Override // J.A0
    public final void b() {
        J2.p0 p0Var = this.f4091j;
        if (p0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            p0Var.a(cancellationException);
        }
        this.f4091j = J2.B.r(this.f4090i, null, 0, this.f4089h, 3);
    }

    @Override // J.A0
    public final void c() {
        J2.p0 p0Var = this.f4091j;
        if (p0Var != null) {
            p0Var.a(new V());
        }
        this.f4091j = null;
    }
}
