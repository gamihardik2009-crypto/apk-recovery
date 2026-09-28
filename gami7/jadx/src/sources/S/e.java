package S;

import java.util.Map;

/* loaded from: classes.dex */
public final class e extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final e f5551j = new e(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f5552k = new e(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5553i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i3) {
        super(i2);
        this.f5553i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5553i) {
            case 0:
                return new h((Map) obj);
            default:
                return obj;
        }
    }
}
