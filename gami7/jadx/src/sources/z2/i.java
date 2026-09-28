package z2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements e, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final int f11902h;

    public i(int i2) {
        this.f11902h = i2;
    }

    @Override // z2.e
    public final int e() {
        return this.f11902h;
    }

    public final String toString() {
        t.f11910a.getClass();
        String a3 = u.a(this);
        h.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
