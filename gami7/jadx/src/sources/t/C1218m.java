package t;

import java.util.List;
import m2.C0880v;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218m extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C1218m f10283j = new C1218m(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1218m f10284k = new C1218m(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1218m f10285l = new C1218m(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1218m(int i2, int i3) {
        super(i2);
        this.f10286i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f10286i) {
            case 0:
                return C0880v.f8657a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new C1228w(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
