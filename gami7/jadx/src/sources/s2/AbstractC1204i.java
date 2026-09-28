package s2;

import q2.InterfaceC1073d;
import z2.t;
import z2.u;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1204i extends AbstractC1198c implements z2.e {

    /* renamed from: k, reason: collision with root package name */
    public final int f10210k;

    public AbstractC1204i(int i2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f10210k = i2;
    }

    @Override // z2.e
    public final int e() {
        return this.f10210k;
    }

    @Override // s2.AbstractC1196a
    public final String toString() {
        if (this.f10203h != null) {
            return super.toString();
        }
        t.f11910a.getClass();
        String a3 = u.a(this);
        z2.h.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
