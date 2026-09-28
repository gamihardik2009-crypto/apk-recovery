package i;

import java.util.HashMap;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700a extends C0705f {

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7788l = new HashMap();

    @Override // i.C0705f
    public final C0702c a(Object obj) {
        return (C0702c) this.f7788l.get(obj);
    }

    @Override // i.C0705f
    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.f7788l.remove(obj);
        return b3;
    }

    public final Object c(Object obj, Object obj2) {
        C0702c a3 = a(obj);
        if (a3 != null) {
            return a3.f7793i;
        }
        HashMap hashMap = this.f7788l;
        C0702c c0702c = new C0702c(obj, obj2);
        this.f7802k++;
        C0702c c0702c2 = this.f7800i;
        if (c0702c2 == null) {
            this.f7799h = c0702c;
            this.f7800i = c0702c;
        } else {
            c0702c2.f7794j = c0702c;
            c0702c.f7795k = c0702c2;
            this.f7800i = c0702c;
        }
        hashMap.put(obj, c0702c);
        return null;
    }
}
