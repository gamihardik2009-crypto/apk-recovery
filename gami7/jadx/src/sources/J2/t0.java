package J2;

import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class t0 extends AbstractC0324v {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f4430j = 0;

    static {
        new t0();
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        x0 x0Var = (x0) interfaceC1078i.s(x0.f4438j);
        if (x0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        x0Var.f4439i = true;
    }

    @Override // J2.AbstractC0324v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
