package J2;

import java.util.concurrent.CancellationException;
import q2.AbstractC1070a;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class l0 extends AbstractC1070a implements Z {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f4414i = new l0(C0325w.f4437i);

    @Override // J2.Z
    public final InterfaceC0314k C(i0 i0Var) {
        return m0.f4415h;
    }

    @Override // J2.Z
    public final void a(CancellationException cancellationException) {
    }

    @Override // J2.Z
    public final boolean b() {
        return true;
    }

    @Override // J2.Z
    public final J g(y2.c cVar) {
        return m0.f4415h;
    }

    @Override // J2.Z
    public final Z getParent() {
        return null;
    }

    @Override // J2.Z
    public final CancellationException i() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // J2.Z
    public final boolean j() {
        return false;
    }

    @Override // J2.Z
    public final Object l(InterfaceC1073d interfaceC1073d) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // J2.Z
    public final J o(boolean z3, boolean z4, y2.c cVar) {
        return m0.f4415h;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
