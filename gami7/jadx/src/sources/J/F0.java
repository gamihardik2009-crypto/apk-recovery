package J;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F0 implements Iterable, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final E0 f4010h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4011i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4012j;

    public F0(E0 e02, int i2, int i3) {
        this.f4010h = e02;
        this.f4011i = i2;
        this.f4012j = i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i2;
        ArrayList arrayList;
        int U3;
        E0 e02 = this.f4010h;
        if (e02.f4004n != this.f4012j) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = e02.f4006p;
        C0255b c0255b = null;
        int i3 = this.f4011i;
        if (hashMap != null) {
            if (!(!e02.f4003m)) {
                C0257c.y("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i3 >= 0 && i3 < (i2 = e02.f3999i) && (U3 = C0257c.U((arrayList = e02.f4005o), i3, i2)) >= 0) {
                c0255b = (C0255b) arrayList.get(U3);
            }
            if (c0255b != null) {
            }
        }
        return new L(e02, i3 + 1, C0257c.j(e02.f3998h, i3) + i3);
    }
}
