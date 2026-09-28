package S2;

import O2.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceArray f5645l;

    public j(long j3, j jVar, int i2) {
        super(j3, jVar, i2);
        this.f5645l = new AtomicReferenceArray(i.f5644f);
    }

    @Override // O2.t
    public final int f() {
        return i.f5644f;
    }

    @Override // O2.t
    public final void g(int i2, InterfaceC1078i interfaceC1078i) {
        this.f5645l.set(i2, i.f5643e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f5206j + ", hashCode=" + hashCode() + ']';
    }
}
