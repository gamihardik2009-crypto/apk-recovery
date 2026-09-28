package u;

import java.util.List;
import m2.C0880v;
import n2.C0970v;

/* loaded from: classes.dex */
public final class o extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final o f10736j = new o(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f10737k = new o(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final o f10738l = new o(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final o f10739m = new o(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10740i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, int i3) {
        super(i2);
        this.f10740i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f10740i) {
            case 0:
                return C0880v.f8657a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new x(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return C0970v.f9165h;
        }
    }
}
