package B1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import n2.AbstractC0946A;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f309a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f310b;

    /* renamed from: c, reason: collision with root package name */
    public K1.o f311c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313e;

    public v(Class cls, int i2) {
        this.f313e = i2;
        UUID randomUUID = UUID.randomUUID();
        z2.h.e(randomUUID, "randomUUID()");
        this.f310b = randomUUID;
        String uuid = this.f310b.toString();
        z2.h.e(uuid, "id.toString()");
        this.f311c = new K1.o(uuid, 0, cls.getName(), (String) null, (h) null, (h) null, 0L, 0L, 0L, (C0014d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0946A.m(1));
        linkedHashSet.add(strArr[0]);
        this.f312d = linkedHashSet;
    }

    public final D a() {
        D b3 = b();
        C0014d c0014d = this.f311c.f4573j;
        boolean z3 = (c0014d.f282h.isEmpty() ^ true) || c0014d.f278d || c0014d.f276b || c0014d.f277c;
        K1.o oVar = this.f311c;
        if (oVar.q) {
            if (!(!z3)) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
            }
            if (oVar.f4570g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
            }
        }
        UUID randomUUID = UUID.randomUUID();
        z2.h.e(randomUUID, "randomUUID()");
        this.f310b = randomUUID;
        String uuid = randomUUID.toString();
        z2.h.e(uuid, "id.toString()");
        K1.o oVar2 = this.f311c;
        z2.h.f(oVar2, "other");
        this.f311c = new K1.o(uuid, oVar2.f4565b, oVar2.f4566c, oVar2.f4567d, new h(oVar2.f4568e), new h(oVar2.f4569f), oVar2.f4570g, oVar2.f4571h, oVar2.f4572i, new C0014d(oVar2.f4573j), oVar2.f4574k, oVar2.f4575l, oVar2.f4576m, oVar2.f4577n, oVar2.f4578o, oVar2.f4579p, oVar2.q, oVar2.f4580r, oVar2.f4581s, oVar2.f4583u, oVar2.f4584v, oVar2.f4585w, 524288);
        return b3;
    }

    public final D b() {
        switch (this.f313e) {
            case 0:
                if (this.f309a && this.f311c.f4573j.f277c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
                }
                return new w(this.f310b, this.f311c, this.f312d);
            default:
                if (this.f309a && this.f311c.f4573j.f277c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
                }
                K1.o oVar = this.f311c;
                if (!oVar.q) {
                    return new B(this.f310b, oVar, this.f312d);
                }
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
    }
}
