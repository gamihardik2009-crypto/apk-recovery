package t1;

import H2.l;
import java.util.ArrayList;
import java.util.List;
import z2.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10659b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10660c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10661d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z3, List list, List list2) {
        h.f(list, "columns");
        h.f(list2, "orders");
        this.f10658a = str;
        this.f10659b = z3;
        this.f10660c = list;
        this.f10661d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                list2.add("ASC");
            }
        }
        this.f10661d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10659b != dVar.f10659b || !h.a(this.f10660c, dVar.f10660c) || !h.a(this.f10661d, dVar.f10661d)) {
            return false;
        }
        String str = this.f10658a;
        boolean e02 = l.e0(str, "index_");
        String str2 = dVar.f10658a;
        return e02 ? l.e0(str2, "index_") : h.a(str, str2);
    }

    public final int hashCode() {
        String str = this.f10658a;
        return this.f10661d.hashCode() + ((this.f10660c.hashCode() + ((((l.e0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f10659b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f10658a + "', unique=" + this.f10659b + ", columns=" + this.f10660c + ", orders=" + this.f10661d + "'}";
    }
}
