public class Q1 {
    //معيب لأنه يدعو مباشرة طريقة الشحن للطبقة الفائقة ("CreditCard) دون التحقق من رصيد بطاقة الائتمان
    // هذا يعني أنه حتى إذا كان الرصيد غير كافٍ لتغطية الشحن ، فستظل طريقة الشحن ترجع إلى حد ما وسيتم تطبيق رسوم العقوبة البالغة 5
    //لإصلاح هذه المشكلة ، يجب على فئة CredatoryCreditCard استخدام طريقة التوابل (إن وجدت) أو تقديم طريقة جديدة في فئة CreditCard التي تسمح بالوصول إلى الرصيد
}
