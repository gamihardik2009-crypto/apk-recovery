package u2;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1328a {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f11270a;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f11270a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f11270a = num2;
    }
}
