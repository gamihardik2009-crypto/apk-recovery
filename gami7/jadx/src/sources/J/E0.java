package J;

import j.C0761q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E0 implements Iterable, A2.a {

    /* renamed from: i, reason: collision with root package name */
    public int f3999i;

    /* renamed from: k, reason: collision with root package name */
    public int f4001k;

    /* renamed from: l, reason: collision with root package name */
    public int f4002l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4003m;

    /* renamed from: n, reason: collision with root package name */
    public int f4004n;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f4006p;
    public C0761q q;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3998h = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public Object[] f4000j = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4005o = new ArrayList();

    public final int a(C0255b c0255b) {
        if (!(!this.f4003m)) {
            C0257c.y("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0255b.a()) {
            return c0255b.f4117a;
        }
        C0257c.W("Anchor refers to a group that was removed");
        throw null;
    }

    public final void b() {
        this.f4006p = new HashMap();
    }

    public final D0 e() {
        if (this.f4003m) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f4002l++;
        return new D0(this);
    }

    public final G0 f() {
        if (!(!this.f4003m)) {
            C0257c.y("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (!(this.f4002l <= 0)) {
            C0257c.y("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f4003m = true;
        this.f4004n++;
        return new G0(this);
    }

    public final boolean g(C0255b c0255b) {
        int U3;
        return c0255b.a() && (U3 = C0257c.U(this.f4005o, c0255b.f4117a, this.f3999i)) >= 0 && z2.h.a(this.f4005o.get(U3), c0255b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this, 0, this.f3999i);
    }
}
