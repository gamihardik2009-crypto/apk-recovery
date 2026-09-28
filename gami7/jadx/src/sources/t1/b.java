package t1;

import B1.t;
import java.util.List;
import z2.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10651c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10652d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10653e;

    public b(String str, String str2, String str3, List list, List list2) {
        h.f(list, "columnNames");
        h.f(list2, "referenceColumnNames");
        this.f10649a = str;
        this.f10650b = str2;
        this.f10651c = str3;
        this.f10652d = list;
        this.f10653e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (h.a(this.f10649a, bVar.f10649a) && h.a(this.f10650b, bVar.f10650b) && h.a(this.f10651c, bVar.f10651c) && h.a(this.f10652d, bVar.f10652d)) {
            return h.a(this.f10653e, bVar.f10653e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10653e.hashCode() + ((this.f10652d.hashCode() + t.e(t.e(this.f10649a.hashCode() * 31, 31, this.f10650b), 31, this.f10651c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f10649a + "', onDelete='" + this.f10650b + " +', onUpdate='" + this.f10651c + "', columnNames=" + this.f10652d + ", referenceColumnNames=" + this.f10653e + '}';
    }
}
