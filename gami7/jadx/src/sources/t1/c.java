package t1;

import z2.h;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public final int f10654h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10655i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10656j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10657k;

    public c(int i2, int i3, String str, String str2) {
        this.f10654h = i2;
        this.f10655i = i3;
        this.f10656j = str;
        this.f10657k = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        h.f(cVar, "other");
        int i2 = this.f10654h - cVar.f10654h;
        return i2 == 0 ? this.f10655i - cVar.f10655i : i2;
    }
}
